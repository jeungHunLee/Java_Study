package generics;

public class GenericBurger <T extends Material> {
    private T material;

    public void setMaterial(T material) {   //제네릭 메서드
        this.material = material;
    }

    public T getMaterial() {    //제네릭 메서드
        return material;
    }

    public String toString() {
        return material.toString();
    }
}
