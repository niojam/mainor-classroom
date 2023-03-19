package ee.mainor.classroom.dto;


import lombok.Data;

@Data
public class StudentDto {

    public void setName(String name) {
        this.name = name;
        nameSmth = name + "smth";
    }

    private String name;
    private String lastname;
    private String nameSmth;



}
