package lesson2;

public class Main {
  private static final String ARRAY_SUM_ERROR_MESSAGE = "Can't summation array";
  private static final String ARRAY_SIZE_ERROR_MESSAGE = "Invalid array size. Size mast be 4x4";
  private static final String ARRAY_DATA_ERROR_MESSAGE = "Invalid data in cell.";
  public static void main(String[] args) {
    String[][] matrix = {
        {"11", "22", "33", "44"},
        {"10", "20", "30", "40"},
        {"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
    };

    try {
      int matrixSum = matrixSummation(matrix);
      System.out.println("Sum = " + matrixSum);
    } catch (MyArraySizeException | MyArrayDataException exception) {
      System.out.println(ARRAY_SUM_ERROR_MESSAGE);
      exception.printStackTrace();
    }
  }

  private static int matrixSummation(String[][] arr) {
    if (arr.length != 4) {
      throw new MyArraySizeException(ARRAY_SIZE_ERROR_MESSAGE);
    }

    int sum = 0;

    for (int i = 0; i < arr.length ; i++) {
      if (arr[i].length != 4) {
        throw new MyArraySizeException(ARRAY_SIZE_ERROR_MESSAGE);
      }
      for (int j = 0; j < arr[i].length; j++) {
        try {
          sum = sum + Integer.parseInt(arr[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(ARRAY_DATA_ERROR_MESSAGE + " row: " + i + "; col: " + j);
        }
      }
    }

    return sum;
  }
}
