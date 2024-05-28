sealed class MyClass {
    sealed class Shape {
        class Circle(var radius: Float) : Shape()
        class Square(var length: Int, var breadth: Int) : Shape()
        class Rectangle(var length: Int, var breadth: Int) : Shape()


        object NotShape : Shape()


    }
}