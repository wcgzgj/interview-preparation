package 枚举;


/**
 * @ClassName Demo1
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/8 上午10:31
 * @Version 1.0
 **/
public class Demo1 {
    enum Color {
        RED{
            /**
             * 每个枚举对象，都要去实现枚举类中的抽象方法
             */
            @Override
            void abstractMethod() {
                System.out.println("this is red");
            }
        },
        GREEN {
            /**
             * 每个枚举对象，都要去实现枚举类中的抽象方法
             */
            @Override
            void abstractMethod() {
                System.out.println("this is green");
            }
        },
        YELLOW {
            /**
             * 每个枚举对象，都要去实现枚举类中的抽象方法
             */
            @Override
            void abstractMethod() {
                System.out.println("this is yellow");
            }
        };

        Color() {
            this.color=this.toString();
        }

        private String color;

        public void outColor() {
            System.out.println(this.color);
        }

        /**
         * 枚举类中的抽象方法
         */
        abstract void abstractMethod();
    }


    public static void main(String[] args) {
        Color red = Color.RED;
        /**
         * 枚举对象，调用方法
         * 方法和枚举类中的方法一致
         */
        red.outColor();
    }
}
