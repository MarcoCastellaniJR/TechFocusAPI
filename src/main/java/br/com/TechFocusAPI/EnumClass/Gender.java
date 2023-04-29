package br.com.TechFocusAPI.EnumClass;

public enum Gender {
    M("Masculino"),
    F("Feminino");
    private String gender;
    Gender(String gender){
        this.gender = gender;
    }
//    public String getGender(){
//        return this.gender;
//    }
}
