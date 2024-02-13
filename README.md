## MVC приложения с уровнем абстракции

- Создан абстрактный класс User и его наследники Student и Teacher. Родитель имеет в себе общие данные (name и birthday), а наследники собственные параметры (studentId для Student, teacherId для Teacher)

- Создан абстрактный класс Group, который содержит поля Teacher и studentsList. Его наследник StudyGroup содержит  собственное поле groupId;

- В классе StudyGroupService реализована функция формирования StudyGroup из Студентов и Преподавателя (Teacher, List<Student>) и функция возвращения группы;