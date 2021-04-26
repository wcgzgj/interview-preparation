package top.faroz.迭代器模式;

import java.util.Iterator;

/**
 * @ClassName BossProjectIterator
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/4/26 下午8:45
 * @Version 1.0
 **/
public class BossProjectIterator {
    public static void main(String[] args) {
        Project project = new Project();
        Iterator iterator = project.createIterator();
        while (iterator.hasNext()) {
            System.out.println((String)iterator.next());
        }
    }
}


interface IProject {
    Iterator createIterator();
}

class Project implements IProject{

    private String[] projects = new String[]{"计划 1","计划 2","计划 3","计划 4"};

    @Override
    public Iterator createIterator() {
        return new ProjectIterator(projects);
    }
}

class ProjectIterator implements Iterator {

    private String[] projects;
    private int position = -1;

    public ProjectIterator(String[] projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        return position<projects.length-1 && projects[position+1]!=null;
    }

    @Override
    public Object next() {
        return projects[++position];
    }

    @Override
    public void remove() {

    }
}
