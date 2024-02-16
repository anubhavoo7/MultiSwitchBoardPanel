package BootCamp.SwitchStimulator;



class Switch {
    private boolean[] fan;
    private boolean[] bulb;
    private boolean[] ac;

    public Switch(int numFans, int numBulb, int numAc){
        fan=new boolean[numFans];
        bulb=new boolean[numBulb];
        ac=new boolean[numAc];

    }

    public int getFanCount() {
        return fan.length;
    }

    public int getBulbCount() {
        return bulb.length;
    }

    public int getACCount() {
        return ac.length;
    }
    public void Status() {
        for (int i = 1; i <= fan.length; i++) {
            System.out.println(i+" Status of Fan-" + i + "-is:" + (fan[i-1] ? "ON" : "OFF"));
        }
        for (int i = 1; i <= bulb.length; i++) {
            System.out.println(i+" Status of Bulb-" + i + "-is:" + (bulb[i-1] ? "ON" : "OFF"));
        }

        for (int i = 1; i <= ac.length; i++) {
            System.out.println(i+" Status of AC-" + i +"-is:" + (ac[i-1] ? "ON" : "OFF"));
        }
    }

    public void displayFan() {
        for (int i = 1; i <= fan.length; i++){
            System.out.println(i+"-Switch Fan: " + i + " ");
    }


    }

    public void displayBulb(){
        for(int i=1;i<=bulb.length;i++) {
            System.out.println(i+"-Switch Bulb: " + i + " ");
        }
    }
    public void displayAc() {
        for (int i = 1; i <= ac.length; i++) {
            System.out.println(i+"-Switch Ac: "+ i +" ");
        }
    }
   public void toggleFan(int choice){
        if(fan[choice-1]){
            fan[choice-1]=false;
        }else {
            fan[choice-1]=true;
        }
   }

   public void toggleBulb(int choice){
        if(bulb[choice-1]){
                bulb[choice-1]=false;
       }
        else {
            bulb[choice-1]=true;
        }
   }
   public void toggleAc(int choice){
        if(ac[choice-1]){
            ac[choice-1]=false;
        }else {
            ac[choice-1]=true;
        }
   }


    }

