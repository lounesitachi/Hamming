public class Hamming {
    public void _main(){
        int[] tram={1,0,1,1};
        int[]tram1={1,1,1,1,1,1,1,1,1,1,1};
        System.out.println("the tram is :");
        print(tram);
        System.out.println("\ncode with hamming :");
        print(hamming_7_4(tram));
        System.out.println("\n");
       int[] tram2=hamming_7_4(tram);
       tram2[4]=1;
       detect_erure_4_7(tram2);
    }
    private int[] hamming_7_4(int[]tram){
        int[] tram1= new int[tram.length+3];
        int j=0;
        int[] tmp_tram=new int[3];
        for(int i=0;i<tram.length+3;i++){
            if(i==0 || i==1 || i==3){
                if(i==0){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[1];
                    tmp_tram[2]=tram[3];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==1){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==3){
                    tmp_tram[0]=tram[1];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tram1[i]=parety(tmp_tram);
                }

            }
            else{
                tram1[i]=tram[j];
                j+=1;
            }
        }
        return tram1;
    }
    private int[] hamming_15_11(int[]tram){
        int[] tram1= new int[tram.length+4];
        int j=0;
        int[] tmp_tram=new int[7];
        for(int i=0;i<tram.length+4;i++){
            if(i==0 || i==1 || i==3 || i==7){
                if(i==0){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[1];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[4];
                    tmp_tram[4]=tram[6];
                    tmp_tram[5]=tram[8];
                    tmp_tram[6]=tram[10];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==1){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[5];
                    tmp_tram[4]=tram[6];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==3){
                    tmp_tram[0]=tram[1];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[7];
                    tmp_tram[4]=tram[8];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==7){
                    tmp_tram[0]=tram[4];
                    tmp_tram[1]=tram[5];
                    tmp_tram[2]=tram[6];
                    tmp_tram[3]=tram[7];
                    tmp_tram[4]=tram[8];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tram1[i]=parety(tmp_tram);
                }
            }
            else{
                tram1[i]=tram[j];
                j+=1;
            }
        }
        return tram1;
    }
    private int[] hamming_31_26(int[]tram){
        int[] tram1= new int[tram.length+4];
        int j=0;
        int[] tmp_tram=new int[15];
        for(int i=0;i<tram.length+4;i++){
            if(i==0 || i==1 || i==3 || i==7 || i==15){
                if(i==0){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[1];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[4];
                    tmp_tram[4]=tram[6];
                    tmp_tram[5]=tram[8];
                    tmp_tram[6]=tram[10];
                    tmp_tram[7]=tram[11];
                    tmp_tram[8]=tram[13];
                    tmp_tram[9]=tram[15];
                    tmp_tram[10]=tram[17];
                    tmp_tram[11]=tram[19];
                    tmp_tram[12]=tram[21];
                    tmp_tram[13]=tram[23];
                    tmp_tram[14]=tram[25];

                    tram1[i]=parety(tmp_tram);
                }
                if(i==1){
                    tmp_tram[0]=tram[0];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[5];
                    tmp_tram[4]=tram[6];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tmp_tram[7]=tram[12];
                    tmp_tram[8]=tram[13];
                    tmp_tram[9]=tram[16];
                    tmp_tram[10]=tram[17];
                    tmp_tram[11]=tram[20];
                    tmp_tram[12]=tram[21];
                    tmp_tram[13]=tram[24];
                    tmp_tram[14]=tram[25];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==3){
                    tmp_tram[0]=tram[1];
                    tmp_tram[1]=tram[2];
                    tmp_tram[2]=tram[3];
                    tmp_tram[3]=tram[7];
                    tmp_tram[4]=tram[8];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tmp_tram[7]=tram[14];
                    tmp_tram[8]=tram[15];
                    tmp_tram[9]=tram[16];
                    tmp_tram[10]=tram[17];
                    tmp_tram[11]=tram[22];
                    tmp_tram[12]=tram[23];
                    tmp_tram[13]=tram[24];
                    tmp_tram[14]=tram[25];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==7){
                    tmp_tram[0]=tram[4];
                    tmp_tram[1]=tram[5];
                    tmp_tram[2]=tram[6];
                    tmp_tram[3]=tram[7];
                    tmp_tram[4]=tram[8];
                    tmp_tram[5]=tram[9];
                    tmp_tram[6]=tram[10];
                    tmp_tram[7]=tram[18];
                    tmp_tram[8]=tram[19];
                    tmp_tram[9]=tram[20];
                    tmp_tram[10]=tram[21];
                    tmp_tram[11]=tram[22];
                    tmp_tram[12]=tram[23];
                    tmp_tram[13]=tram[24];
                    tmp_tram[14]=tram[25];
                    tram1[i]=parety(tmp_tram);
                }
                if(i==15){
                    tmp_tram[0]=tram[11];
                    tmp_tram[1]=tram[12];
                    tmp_tram[2]=tram[13];
                    tmp_tram[3]=tram[14];
                    tmp_tram[4]=tram[15];
                    tmp_tram[5]=tram[16];
                    tmp_tram[6]=tram[17];
                    tmp_tram[7]=tram[18];
                    tmp_tram[8]=tram[19];
                    tmp_tram[9]=tram[20];
                    tmp_tram[10]=tram[21];
                    tmp_tram[11]=tram[22];
                    tmp_tram[12]=tram[23];
                    tmp_tram[13]=tram[24];
                    tmp_tram[14]=tram[25];
                    tram1[i]=parety(tmp_tram);
                }
            }
            else{
                tram1[i]=tram[j];
                j+=1;
            }
        }
        return tram1;
    }
    private void detect_erure_4_7(int[]tram){
    int[] tram1 = new int[tram.length-3];
    int j=0,cpt=-1;
    for(int i =0;i<tram.length;i++){
        if(i!=0 && i!=1 && i!=3){
            tram1[j]=tram[i];
            j+=1;
        }
    } 
    System.out.println("this is the trame :");  
    print(tram1);
    int[] tram2=hamming_7_4(tram1);
    System.out.println("\nthis is the trame sended :");  
    print(tram);
    if(tram2[0]!=tram[0]){
        cpt+=1;
        //System.out.println("\n"+cpt);  
    }
    if(tram2[1]!=tram[1]){
        cpt+=2;
        //System.out.println("\n"+cpt);  
    }
    if(tram2[3]!=tram[3]){
        cpt+=4; 
        //System.out.println("\n"+cpt);  
    }
    print_erore(cpt);
    if(cpt!=-1){
        correct_erore(tram, cpt);}
    print(tram);
    }
    private void detect_erure_15_11(int[]tram){
        int[] tram1 = new int[tram.length-4];
        int j=0,cpt=-1;
        for(int i =0;i<tram.length;i++){
            if(i!=0 && i!=1 && i!=3 && i!=7){
                tram1[j]=tram[i];
                j+=1;
            }
        } 
        System.out.println("this is the trame :");  
        print(tram1);
        int[] tram2=hamming_15_11(tram1);
        System.out.println("\nthis is the trame sended :");  
        print(tram2);
        if(tram2[0]!=tram[0]){
            cpt+=1;
            //System.out.println("\n"+cpt);  
        }
        if(tram2[1]!=tram[1]){
            cpt+=2;
            //System.out.println("\n"+cpt);  
        }
        if(tram2[3]!=tram[3]){
            cpt+=4; 
            //System.out.println("\n"+cpt);  
        }
        if(tram2[7]!=tram[7]){
            cpt+=8; 
            //System.out.println("\n"+cpt);  
        }
        print_erore(cpt);
        if(cpt!=-1){
        correct_erore(tram, cpt);}
        print(tram);     
    }
    private void detect_erure_31_26(int[]tram){
        int[] tram1 = new int[tram.length-4];
        int j=0,cpt=-1;
        for(int i =0;i<tram.length;i++){
            if(i!=0 && i!=1 && i!=3 && i!=7){
                tram1[j]=tram[i];
                j+=1;
            }
        } 
        System.out.println("this is the trame :");  
        print(tram1);
        int[] tram2=hamming_31_26(tram1);
        System.out.println("\nthis is the trame sended :");  
        print(tram2);
        if(tram2[0]!=tram[0]){
            cpt+=1;
            //System.out.println("\n"+cpt);  
        }
        if(tram2[1]!=tram[1]){
            cpt+=2;
            //System.out.println("\n"+cpt);  
        }
        if(tram2[3]!=tram[3]){
            cpt+=4; 
            //System.out.println("\n"+cpt);  
        }
        if(tram2[7]!=tram[7]){
            cpt+=8; 
            //System.out.println("\n"+cpt);  
        }
        if(tram2[15]!=tram[15]){
            cpt+=16; 
            //System.out.println("\n"+cpt);  
        }
        print_erore(cpt);
        if(cpt!=-1){
        correct_erore(tram, cpt);}
        print(tram);     
    }
    ////////////////////////////////////////////////////////////////////

    private int[] correct_erore(int[] tram,int cpt) {
        if(tram[cpt]==1){
            tram[cpt]=0;
        }
        else {
            tram[cpt]=1;
        }
        return tram;
    }

    private void  print_erore(int cpt){
        int cpt1=cpt;
        if(cpt1==-1){
            System.out.println("\nthere is no erore !!");
        }
        else{
            cpt1+=1;
            System.out.println("\nthe eroure is in posion "+cpt);
        }
    }
    private int parety(int[] tram){
        int p=0;
        for (int i=0;i< tram.length;i++){
            p+=tram[i];
        }
        p %= 2;

        return p;
    }
    private void print(int[]tram){
        for (int i=0;i<tram.length;i++){
            System.out.print(tram[i]);

            //System.out.println("_");
        }
    }
}
