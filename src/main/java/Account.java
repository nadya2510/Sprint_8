public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean checkOut = true;

        if (name.startsWith(" ")) {
            checkOut = false;
        } else if (name.endsWith(" ")) {
            checkOut = false;
        } else if ((name.length() - name.replaceAll(" ", "").length()) != 1){
            checkOut = false;
        } else if (name.length() < 3) {
            checkOut = false;
        } else if (name.length() > 19) {
            checkOut = false;
        }


        return checkOut;

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

    }

}