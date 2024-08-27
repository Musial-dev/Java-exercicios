package curso.programacao;

public class Employee {

	public String name;
	public Double grossSalary;
	public Double tax;

	public Double netSalary() {
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(Double percetage) {
		this.grossSalary = this.grossSalary + (this.grossSalary * (percetage / 100));
	}

	@Override
	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.netSalary());
	}
}
