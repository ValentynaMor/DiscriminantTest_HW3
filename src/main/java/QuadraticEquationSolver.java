class QuadraticEquationSolver {

    public static Solution solveQuadraticEquation(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("First argument can not be 0");
        }

        double discriminant = calculateDiscriminant(a, b, c);
        if (discriminant > 0)
            return calculateWhenDiscriminantIsMoreThanZero(discriminant, a, b);
        else if (discriminant == 0)
            return calculateWhenDiscriminantIsEqualToZero(a, b);
        return null;
    }
    private static double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static Solution calculateWhenDiscriminantIsMoreThanZero(double d, double a, double b) {
        Solution solution = new Solution();
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        solution.setX1(x1);
        solution.setX2(x2);
        return solution;
    }

    private static Solution calculateWhenDiscriminantIsEqualToZero(double a, double b) {
        Solution solution = new Solution();
        double x;
        x = -b / (2 * a);
        solution.setX1(x);
        solution.setX2(x);
        return solution;
    }

    public static class Solution {
        private double x1;
        private double x2;

        public void setX1(double x1) {
            this.x1 = x1;
        }

        public void setX2(double x2) {
            this.x2 = x2;
        }

        public double getX1() {
            return x1;
        }

        public double getX2() {
            return x2;
        }
    }
}
