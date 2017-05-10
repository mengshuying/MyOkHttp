package com.example.administrator.myokhttp.okhttp;

import java.util.List;

/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */

public class JsonBean {

    /**
     * Students : {"Student":[{"name":"张三","content":"学生简介学生简介学生简介学生简介学生简介","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "},{"name":"李四","content":"这是一个好学生，好好学习，特别努力","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "},{"name":"王五","content":"喜欢读书，喜欢英语，认真学习的时候特别多","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "},{"name":"赵老大","content":"长的好看，个头大","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "},{"name":"秦老二","content":"努力学习，认真工作","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "},{"name":"齐老三","content":"齐老三学习好，是一个三好学生","img":"http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg "}]}
     */

    private StudentsBean Students;

    public StudentsBean getStudents() {
        return Students;
    }

    public void setStudents(StudentsBean Students) {
        this.Students = Students;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "Students=" + Students +
                '}';
    }

    public static class StudentsBean {
        private List<StudentBean> Student;

        public List<StudentBean> getStudent() {
            return Student;
        }

        public void setStudent(List<StudentBean> Student) {
            this.Student = Student;
        }

        @Override
        public String toString() {
            return "StudentsBean{" +
                    "Student=" + Student +
                    '}';
        }

        public static class StudentBean {
            /**
             * name : 张三
             * content : 学生简介学生简介学生简介学生简介学生简介
             * img : http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg
             */

            private String name;
            private String content;
            private String img;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            @Override
            public String toString() {
                return "StudentBean{" +
                        "name='" + name + '\'' +
                        ", content='" + content + '\'' +
                        ", img='" + img + '\'' +
                        '}';
            }
        }
    }
}
