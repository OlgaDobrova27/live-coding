public class Main {

        public static void main (String[]args) {

            String str = "World \t \r \n Amazing";

            //Удаляем все пробелы
            str = str.replaceAll("\\s", "");
            System.out.println(str);

    }
    }
