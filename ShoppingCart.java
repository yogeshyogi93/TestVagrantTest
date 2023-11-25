    public class ShoppingCart {
        private String _productName;
        private double _unitPrice;
        private double _gst;
        private int _qty;
        public ShoppingCart(String productName, double unitPrice, double gst, int qty)
        {
            _gstproductName = productName;
            _unitPrice = unitPrice;
            _gst  = gst;
            _qty = qty;
        } 
        public void productName(String name)
        {
            this._productName = name;
        }
        public String ProductName(){
            return _productName;
        }
        public double UnitPrice(){
            return _unitPrice;
        }
        public double GST(){
            return _gst;
        }
        public int Qty(){
            return _qty;
        }
    }
    main.java.txt
    Displaying tv.txt.
    
}
