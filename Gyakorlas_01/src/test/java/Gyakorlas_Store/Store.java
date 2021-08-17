package Gyakorlas_Store;

    public class Store{

        public String getProduct(){
            return product;
        }
        private String product;

        public Store(String product){
            this.product= product;
        }

        public int getStock() {
            return stock;
        }

        private int stock=0;

        public int store(int beszall){
            this.stock = stock + beszall;
            return stock;
        }
        public int dispatch(int kiszall){
            return stock - kiszall;
        }

    }
