package com.proccess;

public class Proccess {
  protected int KEY;
  protected String name;
  private Proccess proccessTable[];
  public int allProccess = 0;
  int createProccess(final int max_proccess , final String name ){
    if(allProccess < max_proccess){
      Proccess newProccess = new Proccess();
      newProccess.KEY = allProccess;
      newProccess.name = name;
      proccessTable[allProccess] = newProccess;
      ++allProccess;
      return 0;
    }
    else {
       return 1;
    }
  }
  int exitProccess(final int max_proccess , final String name){
    if (allProccess != 0) {
       for(int i = 0; i < max_proccess ; i++){
         Proccess findProcess = new Proccess();
         findProcess.KEY = i;
         findProcess.name = name;
         if(proccessTable[i] == findProcess){
           proccessTable[i] = null;
           allProccess--;
         }
       }
    }
    else {
      return 1;
    }
    return 0;
  }    
}
