package Assignment11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class DAO<Entity> { // Bỏ từ khóa 'public'
    private List<Entity> entityList;

    public DAO() {
        this.entityList = new ArrayList<>();
    }

    public void add(Entity entity) {
        entityList.add(entity);
    }

    public void remove(Entity entity) {
        entityList.remove(entity);
    }

    public List<Entity> getList() {
        return entityList;
    }

    public List<Entity> entityList() {
        return new ArrayList<>(entityList);
    }
    public abstract void update(Entity entity);
    public abstract Entity find(Serializable Product);
}
