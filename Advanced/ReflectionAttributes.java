
    import java.lang.reflect.*;
    import java.util.*;

    class Students{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public String getEmail() {
            return email;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }

    class ReflectionAttributes {

        public static void main(String[] args){
            Class student = Students.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList();
            for(Method method:methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }





