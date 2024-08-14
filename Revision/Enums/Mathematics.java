public class NestedEnumsExample {

    public enum OuterEnum {
        INSTANCE;
        
        // Static initializer for the outer enum
        static {
            System.out.println("Static initializer of OuterEnum");
        }
        
        // Instance initializer for the outer enum
        {
            System.out.println("Instance initializer of OuterEnum");
        }
        
        public OuterEnum() {
            System.out.println("Constructor of OuterEnum");
        }

        public enum MiddleEnum {
            INSTANCE;
            
            // Static initializer for the middle enum
            static {
                System.out.println("Static initializer of MiddleEnum");
            }
            
            // Instance initializer for the middle enum
            {
                System.out.println("Instance initializer of MiddleEnum");
            }
            
            public MiddleEnum() {
                System.out.println("Constructor of MiddleEnum");
            }

            public enum InnerEnum {
                INSTANCE;
                
                // Static initializer for the inner enum
                static {
                    System.out.println("Static initializer of InnerEnum");
                }
                
                // Instance initializer for the inner enum
                {
                    System.out.println("Instance initializer of InnerEnum");
                }
                
                public InnerEnum() {
                    System.out.println("Constructor of InnerEnum");
                }
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println("Accessing OuterEnum");
        // OuterEnum outerEnum = OuterEnum.INSTANCE;
        
        // System.out.println("Accessing MiddleEnum");
        // OuterEnum.MiddleEnum middleEnum = OuterEnum.MiddleEnum.INSTANCE;
        
        System.out.println("Accessing InnerEnum");
        OuterEnum.MiddleEnum.InnerEnum innerEnum = OuterEnum.MiddleEnum.InnerEnum.INSTANCE;
    }
}
