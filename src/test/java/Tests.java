import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void testWhenDiscriminantIsLessThanZero() {
        QuadraticEquationSolver.Solution solution = QuadraticEquationSolver.solveQuadraticEquation(3, -4, 2);
        Assert.assertNull(solution);
        System.out.println(" Result: null");
    }

    @Test
    public void testWhenDiscriminantIsMoreThanZero() {
        QuadraticEquationSolver.Solution solution = QuadraticEquationSolver.solveQuadraticEquation(1, -4, -5);
        Assert.assertTrue((solution.getX1() == 5)||(solution.getX1() == -1));
        Assert.assertTrue((solution.getX2() == 5)||(solution.getX2() == -1));
        System.out.printf("Result: x1 = %s, x2 = %s", solution.getX1(), solution.getX2());
    }

    @Test
    public void testDiscriminantIsEqualToZero() {
        QuadraticEquationSolver.Solution solution = QuadraticEquationSolver.solveQuadraticEquation(1, -4, 4);
        Assert.assertTrue((solution.getX1() == solution.getX2()));
        Assert.assertEquals(solution.getX1(),2);
        System.out.printf("Result: x1 = x2 = %s", solution.getX1());
    }
}