package seminar4;

import seminar4.controller.StudentController;
import seminar4.controller.TeacherController;
import seminar4.model.Student;
import seminar4.model.StudentGroup;
import seminar4.repository.StudentRepository;
import seminar4.repository.TeacherRepository;
import seminar4.service.StudentService;
import seminar4.service.TeacherService;
import seminar4.view.SortType;
import seminar4.view.StudentView;
import seminar4.view.TeacherView;
import seminar4.view.UserView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView view1=getTeacherView();
//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        //view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        //view.sendOnConsole(SortType.NONE);
        //view.sendOnConsole(SortType.NAME);
        //view.sendOnConsole(SortType.FAMILY);
        //view.sendOnConsole(SortType.AGE);

        view1.create("Mariya Ivanovna Solov'eva", 42, "452635");
        view1.create("Petr Semenovich Vorobev", 54, "54865");
        view1.create("Sidor Petrovich Sidorov", 29, "16212");
        view1.create("Elena Alekseevna Ivanova", 64, "9165241");
        view1.create("Anna Olegovna Morozova", 49, "016589");
        view1.sendOnConsole(SortType.NONE);
        view1.sendOnConsole(SortType.NAME);
        view1.sendOnConsole(SortType.FAMILY);
        view1.sendOnConsole(SortType.AGE);
        view1.changeTeacher();
        view1.sendOnConsole(SortType.NONE);

        //___если, раскомментирую вызов метода редактирования еще раз, будет ошибка NoSuchElementException
        // я так понимаю, создавать scanner в методе прям видимо, нельзя... проконсультируйте, пожалуйста..
        //view1.changeTeacher();
        //view1.sendOnConsole(SortType.NONE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}