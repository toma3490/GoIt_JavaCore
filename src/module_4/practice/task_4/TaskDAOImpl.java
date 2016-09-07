package module_4.practice.task_4;

public class TaskDAOImpl extends AbstractDAO implements DAO {
    @Override
    public Object save(Object task) {
        return super.save(task);
    }

    @Override
    public Object update(Object task) {
        return super.update(task);
    }

    @Override
    public boolean delete(Object task) {
        return super.delete(task);
    }

    @Override
    public Object find(long id) {
        Task task = new Task("Calculate min/max....");
        task.setId(id);
        return task;
    }

    //    @Override
//    public Object save(Object task) {
//        Task task1 = (Task) task;
//        System.out.println(task1.toString() + "saved");
//        return task1;
//    }
//
//    @Override
//    public Object update(Object task) {
//        System.out.println(task.toString() + "update");
//        return task;
//    }
//
//    @Override
//    public boolean delete(Object task) {
//        System.out.println(task.toString() + "deleted");
//        return true;
//    }
//
//    @Override
//    public Object find(long id) {
//        Task task = new Task("Calculate min/max....");
//        task.setId(id);
//        return task;
//    }
}
