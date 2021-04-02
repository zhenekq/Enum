package by.epamtc.runner;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Color.BLACK.getColorCode());
        System.out.println(Color.WHITE.getColorCode());
        System.out.println(Color.SEMI_WHITE.getColorCode());

        Operation operation = null;
        System.out.println(Operation.SUM.action(10,4));
        System.out.println(Operation.SUBTRACT.action(10,4));
        System.out.println(Operation.MULTIPLY.action(10,4));
        System.out.println(Operation.DIVIDE.action(12,4));


    }
}

enum Color{
    BLACK("#000"), WHITE("#fff"), SEMI_WHITE("#f1f1f1");
    private String colorCode;
    Color(String colorCode){
        this.colorCode = colorCode;
    }
    public String getColorCode(){
        return this.colorCode;
    }
}

enum Operation{
    SUM{
        @Override
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT{
        @Override
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY{
        @Override
        public int action(int x, int y) {
            return x * y;
        }
    },
    DIVIDE{
        @Override
        public int action(int x, int y) {
            return x / y;
        }
    };

    public abstract int action(int x, int y);

}
