package se.lexicon.sanya;

import java.util.Arrays;

public class SystemDeveloper extends Employee{

protected static final int CERTIFICATE_EXTRA_SAL = 1_000;
protected static final int LANGUAGE_EXTRA_SAL = 1_500;


private String[] certificates;
private String[] language;

    public SystemDeveloper(String name, String[]certificates, String[]language) {
        super(name);
        this.certificates = certificates;
        this.language = language;
        calculateSalary();
    }

    public SystemDeveloper(String name) {
        super(name);
        this.certificates = new String[0];
        this.language = new String[0];
    }

    @Override
    public void calculateSalary() {

        int certificateExtra = certificates.length* CERTIFICATE_EXTRA_SAL;
        int languageExtra = language.length* LANGUAGE_EXTRA_SAL;
        int totalSalary = Employee.baseSalary + certificateExtra+languageExtra;
        setSalary(totalSalary);// salary total


    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "Salary =" + super.getSalary() +
                ", certificates=" + Arrays.toString(certificates) +
                ", language=" + Arrays.toString(language) +
                '}';
    }
}
