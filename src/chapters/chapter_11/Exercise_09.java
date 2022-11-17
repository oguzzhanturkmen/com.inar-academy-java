package chapters.chapter_11;

import chapters.chapter_08.Exercise_14;

import java.util.ArrayList;

public class Exercise_09 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListRow = new ArrayList<>();
        ArrayList<Integer> arrayListCol = new ArrayList<>();
        int[][] array = new int[4][4];
        Exercise_14.fillTheArray(array);
        Exercise_14.displayArray(array);
        findSumtRow(array, arrayListRow);
        findSumtCol(array, arrayListCol);
        ArrayList<Integer> rowList = rowIndexList(arrayListRow);
        ArrayList<Integer> colList = rowIndexList(arrayListCol);

        System.out.println("The largest row index : " + rowList);
        System.out.println("The largest col index : " + colList);

    }

    public static void findSumtRow(int[][] array, ArrayList<Integer> rowList) {


        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[0].length; col++) {
                sum += array[row][col];

            }
            rowList.add(sum);
        }

    }

    public static void findSumtCol(int[][] array, ArrayList<Integer> colList) {

        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int col = 0; col < array[0].length; col++) {
                sum += array[col][row];

            }
            colList.add(sum);
        }
    }

    public static ArrayList<Integer> rowIndexList(ArrayList<Integer> rowList) {
        int max = java.util.Collections.max(rowList);
        ArrayList<Integer> rowIndex = new ArrayList<>();
        for (int i = 0; i < rowList.size(); i++) {
            if (rowList.get(i) == max) {
                rowIndex.add(i);
            }
        }
        return rowIndex;
    }

    public static ArrayList<Integer> colIndexList(ArrayList<Integer> colList) {
        int max = java.util.Collections.max(colList);
        ArrayList<Integer> colIndex = new ArrayList<>();
        for (int i = 0; i < colList.size(); i++) {
            if (colList.get(i) == max) {
                colIndex.add(i);
            }
        }
        return colIndex;
    }

}
