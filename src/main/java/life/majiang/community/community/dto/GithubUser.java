package life.majiang.community.community.dto;

public class GithubUser {

    private Long id;
    private String name;
    private String boi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoi() {
        return boi;
    }

    public void setBoi(String boi) {
        this.boi = boi;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", boi='" + boi + '\'' +
                '}';
    }
}
