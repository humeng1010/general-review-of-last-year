public @interface MyBook {
    String name();

    String[] authors();

    double price() default 50;//默认值50
}