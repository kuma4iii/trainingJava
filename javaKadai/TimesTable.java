package javaKadai;

class TimesTable {
    /*演習４－２３
     * かけ算九九の表を表示するプログラムを作成してください。
     * 
     * プログラム名：TimesTable.java
     */
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = i * j;
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}
