public class NestedEnumsExample {

    private enum OuterEnum {
        INSTANCE;
        
        // Static initializer for the outer enum
        static {
            System.out.println("3. Static initializer of OuterEnum");
        }
        
        // Instance initializer for the outer enum
        {
            System.out.println("2. Instance initializer of OuterEnum");
        }
        
         OuterEnum() {
            System.out.println("1. Constructor of OuterEnum");
        }

        private enum MiddleEnum {
            INSTANCE;
            
            // Static initializer for the middle enum
            static {
                System.out.println("7. Static initializer of MiddleEnum");
            }
            
            // Instance initializer for the middle enum
            {
                System.out.println("6. Instance initializer of MiddleEnum");             }
            
             MiddleEnum() {
                System.out.println("5. Constructor of MiddleEnum");
            }

            private enum InnerEnum {
                INSTANCE;
                
                // Static initializer for the inner enum
                static {
                    System.out.println("11. Static initializer of InnerEnum");
                }
                
                // Instance initializer for the inner enum
                {
                    System.out.println("9. Instance initializer of InnerEnum");
                }
                
                 InnerEnum() {
                    System.out.println("10. Constructor of InnerEnum");
                }
            }
        }
    }

    public static void main(String[] args) {
         System.out.println("0. Accessing OuterEnum");
         OuterEnum outerEnum = OuterEnum.INSTANCE;
        
         System.out.println("4. Accessing MiddleEnum");
         OuterEnum.MiddleEnum middleEnum = OuterEnum.MiddleEnum.INSTANCE;
        
         System.out.println("8. Accessing InnerEnum");
         OuterEnum.MiddleEnum.InnerEnum innerEnum = OuterEnum.MiddleEnum.InnerEnum.INSTANCE;
    }
}
