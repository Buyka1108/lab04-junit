# Лаборатори №4 — Нэгжийн тест JUnit 5

## Оюутны мэдээлэл

- Нэр: Ж.Буянхишиг
- Оюутны код: B232270114

## Ашигласан орчин

### Java хувилбар

openjdk version "17.0.20.1" 2026-08-18  
OpenJDK Runtime Environment (build 17.0.20.1+1-1-26.04-Ubuntu)  
OpenJDK 64-Bit Server VM (build 17.0.20.1+1-1-26.04-Ubuntu, mixed mode, sharing)

### Maven хувилбар

Apache Maven 3.9.12  
Maven home: /usr/share/maven  
Java version: 17.0.20.1, vendor: Ubuntu  
OS: Linux (WSL2)

## Төслийн тайлбар

Энэ лабораторийн ажлаар JUnit 5 ашиглан GradeCalculator класст нэгжийн тест бичсэн. GradeCalculator класс нь оюутны нийлбэр онооноос үсгэн дүн тооцох `letterGrade()` болон үнэлгээний хэсгүүдийн нийлбэр оноог тооцох `totalScore()` методтой.

## Тестийн мэдээлэл

- Тестийн методын тоо: 14
- `@Test` методын тоо: 12
- `@ParameterizedTest` методын тоо: 2
- Tests run: 24
- Failures: 0
- Errors: 0
- Skipped: 0
- Үр дүн: BUILD SUCCESS

Амжилттай тестийн гаралтыг `results/mvn-test.txt` файлд хадгалсан.

## Mutation test

`GradeCalculator` классын `letterGrade()` метод дахь:

`score >= 90`

нөхцөлийг зориуд:

`score > 90`

болгон өөрчилж mutation test хийсэн.

Mutation хийхэд дараах 2 тест унасан:

- `score90ShouldBeA`
- `letterGradeBoundaries`

Mutation тестийн үр дүн:

- Tests run: 24
- Failures: 2
- Errors: 0
- Skipped: 0
- Үр дүн: BUILD FAILURE

Mutation тестийн гаралтыг `results/mvn-test-mutant.txt` файлд хадгалсан. Mutation тестийн дараа `score > 90` нөхцөлийг буцааж `score >= 90` болгон засаж, бүх тестийг дахин ажиллуулахад 24 тест бүгд амжилттай болсон.

## Дүгнэлт

Энэ лабораторийн ажлаар JUnit 5 ашиглан нэгжийн тест бичиж, assertion ашиглан үр дүнг шалгаж сурлаа. `letterGrade()` методын ердийн утгууд болон 90, 89.99, 60, 59.99, 0, 100 зэрэг хязгаарын утгуудыг тестэлсэн. Мөн буруу оролтуудад `assertThrows` ашиглан `IllegalArgumentException` шидэж байгаа эсэхийг шалгасан. `totalScore()` методын зөв нийлбэр болон зөвшөөрөгдсөн хязгаараас гарсан утгуудыг мөн шалгасан. Parameterized test ашигласнаар ижил логиктой олон оролтыг нэг тестийн методоор шалгах боломжтойг ойлгосон. Хамгийн сонирхолтой нь `score >= 90` нөхцөлийг `score > 90` болгон өөрчлөхөд 90 онооны хязгаарын алдааг тестүүд шууд илрүүлсэн. Энэ туршилтаар хязгаарын утгуудыг зөв тестлэх нь жижиг өөрчлөлтөөс үүсэх алдааг илрүүлэхэд чухал болохыг харсан.
