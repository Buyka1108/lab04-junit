package mn.edu.must.sqat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    @Test
    @DisplayName("95 оноо A дүн байх ёстой")
    void score95ShouldBeA() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 95.0;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("A", result);
    }

    @Test
    @DisplayName("90 оноо яг A дүн байх ёстой (хязгаарын тохиолдол)")
    void score90ShouldBeA() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 90.0;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("A", result);
    }

    @Test
    @DisplayName("89.99 оноо B дүн байх ёстой")
    void score8999ShouldBeB() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 89.99;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("B", result);
    }

    @Test
    @DisplayName("60 оноо яг D дүн байх ёстой")
    void score60ShouldBeD() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 60.0;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("D", result);
    }

    @Test
    @DisplayName("59.99 оноо F дүн байх ёстой")
    void score5999ShouldBeF() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 59.99;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("F", result);
    }

    @Test
    @DisplayName("0 оноо F дүн байх ёстой")
    void score0ShouldBeF() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 0.0;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("F", result);
    }

    @Test
    @DisplayName("100 оноо A дүн байх ёстой")
    void score100ShouldBeA() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        double score = 100.0;

        // Act
        String result = calc.letterGrade(score);

        // Assert
        assertEquals("A", result);
    }

    @Test
    @DisplayName("-1 оноо оруулахад IllegalArgumentException шидэх ёстой")
    void negativeScoreShouldThrowException() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calc.letterGrade(-1)
        );
    }

    @Test
    @DisplayName("101 оноо оруулахад IllegalArgumentException шидэх ёстой")
    void scoreOver100ShouldThrowException() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calc.letterGrade(101)
        );
    }

    @Test
    @DisplayName("Зөв утгуудаар totalScore 100 гарах ёстой")
    void totalScoreShouldReturn100() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();

        // Act
        double result = calc.totalScore(10, 40, 10, 10, 30);

        // Assert
        assertEquals(100.0, result);
    }

    @Test
    @DisplayName("Сөрөг ирц оруулахад IllegalArgumentException шидэх ёстой")
    void negativeAttendanceShouldThrowException() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calc.totalScore(-5, 40, 10, 10, 30)
        );
    }

    @Test
    @DisplayName("Лабын оноо 40-өөс хэтэрвэл IllegalArgumentException шидэх ёстой")
    void labOver40ShouldThrowException() {
        // Arrange
        GradeCalculator calc = new GradeCalculator();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calc.totalScore(10, 41, 10, 10, 30)
        );
    }
}
