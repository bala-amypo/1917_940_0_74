
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student studentService) {
        return studentService.saveStudent(studentService);
    }

    @GetMapping("/getdata")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getdata/{id}")
    public Student getbyid(@PathVariable int id) {
        return studentService.getbyid(id);
    }

    @PutMapping("/updatedata/{id}")
    public Student updatedata(@PathVariable int id,@RequestBody Student studentService) {
        return studentService.updatedata(id,studentService);
    }

    @DeleteMapping("/deletedata/{id}")
    public Student deletedata(@PathVariable int id) {
        return studentService.deletedata(id);
    }
}