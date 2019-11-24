package repl;

public class HWMethodsWithReturnValidateTask {
    public static void main(String[] args) {
//We have a to do list app, every time a user adds a task - a few things needed to be checked.
//
//It should not be empty. boolean parameter needs to be true
//taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.
        System.out.println(validateTask(true,8,7));
    }
    public static boolean validateTask (boolean notEmpty, int taskId, int currentId){
    int task = taskId%currentId;
        if (notEmpty==true && task==1){
            return true;
        }
        return false;
    }
}