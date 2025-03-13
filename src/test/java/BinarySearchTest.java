import static org.junit.jupiter.api.Assertions.*;

import org.example.BinarySearch;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BinarySearchTest {

    @ParameterizedTest
    @CsvSource({
            "'1,3,5,7,9', 3, 1",  // Tìm thấy ở vị trí 1
            "'1,3,5,7,9', 9, 4",  // Tìm thấy ở cuối
            "'1,3,5,7,9', 1, 0",  // Tìm thấy ở đầu
            "'1,3,5,7,9', 4, -1", // Không tìm thấy
            "'1,3,5,7,9', 10, -1", // Không tìm thấy
            "'', 5, -1",  // Mảng rỗng
            "'', 1, -1", // Mảng rỗng, tìm số bất kỳ
            "'', -5, -1", // Mảng rỗng, tìm số âm
            "'5', 0, -1", // Mảng một phần tử, không khớp
            "'10', 20, -1", // Mảng một phần tử, không khớp
            "'-3', 3, -1", // Mảng một phần tử âm, không khớp
            "'100', -100, -1", // Mảng một phần tử dương, không khớp với số âm
            "'5', 5, 0",  // Mảng một phần tử, tìm thấy
            "'5', 3, -1",  // Mảng một phần tử, không tìm thấy
            "'1,2', 2, 1",  // Mảng hai phần tử, tìm thấy phần tử cuối
            "'1,2', 1, 0",  // Mảng hai phần tử, tìm thấy phần tử đầu
            "'1,2', 3, -1", // Mảng hai phần tử, không tìm thấy
            "'1,2,3', 2, 1", // Mảng ba phần tử, tìm thấy giữa
            "'1,2,3', 3, 2", // Mảng ba phần tử, tìm thấy cuối
            "'1,2,3', 4, -1", // Mảng ba phần tử, không tìm thấy
            "'1,3,5,7,9,11', 6, -1" // Giá trị không có trong mảng chẵn phần tử
    })

    void testEmptyOrSingleElementArray(String arrayStr, int target, int expected) {
        int[] arr = parseArray(arrayStr);
        int result = BinarySearch.search(arr, target);
        assertEquals(expected, result);
    }

    void testBinarySearch(String arrayStr, int target, int expected) {
        int[] arr = parseArray(arrayStr);
        int result = BinarySearch.search(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i * 2; // Mảng số chẵn từ 0 đến 1998
        }
        assertEquals(500, BinarySearch.search(arr, 1000)); // Tìm thấy ở giữa
        assertEquals(999, BinarySearch.search(arr, 1998)); // Tìm thấy ở cuối
        assertEquals(0, BinarySearch.search(arr, 0)); // Tìm thấy ở đầu
        assertEquals(-1, BinarySearch.search(arr, 2001)); // Không tìm thấy
    }

    private int[] parseArray(String arrayStr) {
        if (arrayStr.isEmpty()) return new int[]{};
        String[] parts = arrayStr.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }
}
