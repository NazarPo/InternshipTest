package institution;

import person.Student;

public interface KnowledgeSource {
    String getName();
    void teach(Student student);
}
