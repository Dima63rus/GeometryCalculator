public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
//        Площадь круга пr(2)
        return Math.PI * Math.pow(radius, 2.0);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
//        Площадь сферы 4PR(2)
        return 4 * Math.PI * Math.pow(radius, 2.0);
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
//        Условия возможности построения треугольника
        if ((a + b) > c == true || (a + c) > b == true || (c + b) > a == true) {
            return true;
        } else
            return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTriangleRightAngled(a, b, c) == false) {
            return 0;
        } else {
//            Подсчитать периметр треугольника
            double lvP = (a + b + c);

//            Подсчитать площадь треугольнка
            return Math.sqrt(lvP * (lvP - a) * (lvP - b) * (lvP - c));
        }
    }
}