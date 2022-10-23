package chapters.chapter_08;

public class Exercise_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(array);
        Exercise_10.displayArray(array);

    }

    public static void sort(int[][] m){
        int index ;
        int[] temp ;

        for (int i = 0; i < m.length - 1; i++) {
            index = i;

            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] < m[index][0]) {
                    index = j;
                }
                else if (m[j][0] == m[index][0]) {
                    if (m[j][1] < m[i][1]) {
                        index = j;
                    }
                }
            }

            if(index != i){
                temp = m[i];
                m[i] = m[index];
                m[index] = temp;

            }
        }
    }

    }

