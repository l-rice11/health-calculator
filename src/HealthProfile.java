


 public class HealthProfile {
     
        private String name;
        private int age;
        private double weight;
        private double height;
        
        //default profile attributes
        public HealthProfile()  {
            name = "unknown";
            age = 0;
            weight = 0.0;
            height = 0.0;
        }
        
        //full attributes
        public HealthProfile(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        
        public HealthProfile(String name, int age, double weight, int feet, double inches) {
            this.setName(name);
            setAge(age);
            setWeight(weight);
            setHeight(feet, inches);
        }
        
        /* -----SETTERS AND GETTERS----- */
        
        //method to get name
        public void setName(String newName) {
            if(newName.length() > 0) { //name must be 1 character or longer
                this.name = newName;
            } else {
                this.name = "unknown";
            }
        }
        
        //method to get age
        public void setAge(int newAge) {
            if(newAge > 0) {            //must be greater than 0
                this.age = newAge;
            } else {
                this.age = 0;
            }
        }
        
        //method to get weight
        public void setWeight(double newWeight) {
            if(newWeight > 0.0) {         //must be greater than 0
                this.weight = newWeight;
            } else {
                this.weight = 0;
            }
        }
        
        //method to get height
        public void setHeight(int feet, double inches) {
            double total = (feet * 12) + inches;
            
            if(total > 0.0) {
                this.height = total;
            } else {
                this.height = 0.0;
            }
        }
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public double getWeight() {
            return weight;
        }
        
        public double getHeight() {
            return height;
        }
        
        //method for getting BMI
        public double getBMI() {
            return (weight * 703) / (Math.pow(height, 2));
        }
        
        //method for setting category based on BMI
        public String getCategory() {
            double bmi = getBMI();
            if(bmi < 18.5) {
                return "Underweight";
            }
            else if(bmi >= 18.5 && bmi <= 24.9) {
                return "Normal";
            }
            else if(bmi >= 25 && bmi <= 29.9) {
                return "Overweight";
            }
            else {
                return "Obese";
            }
        }
        
        //method for gathering max heart rate
        public int getMaxHR() {
            return (220 - age);
        }
        
    }
        
