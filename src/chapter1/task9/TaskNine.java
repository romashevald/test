package chapter1.task9;

/*В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t при вызове метода s.equals(t),
 но не с помощью операции s != t.
  Придумайте другой пример, в котором не применяется метод substring ().*/
public class TaskNine {



//    int[] arrIntOne = new int[one.length()];
//            int[] arrIntTwo = new int[two.length()];
//            for (int i = 0; i < one.length(); i++) {
//
//                arrIntOne[i] = Integer.parseInt(one);
//                arrIntTwo[i] = Integer.parseInt(two);
//                System.out.println("One"+arrIntOne+" Two"+ arrIntTwo);

//    public boolean StringCompare(String one, String two){
//
//        if (definitionOfLineContent(one, two)) {
//            System.out.println("Lines are equals");
//            return true;
//        }
//        else {
//            System.out.println("Lines are not equals");
//            return trutwe;
//        }
//    }

    public boolean stringCompare(String one, String two) {

        if (one.length() != two.length()) {
            System.out.println("Lines are not equal");
            return false;
        }
            else {
            for (int i = 0; i < one.length(); i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    return false;
                } else {
                    System.out.println("Lines equals");
                    return true;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TaskNine app = new TaskNine();
        app.stringCompare("asdf", "asd");
    }
}
