package Competition_Composite.PaperTypes.OffsetPaper;

import Competition_Composite.PrintingPaperProduct;

import java.util.ArrayList;
import java.util.List;

public class OffsetPaperBox extends PrintingPaperProduct {
    List<PrintingPaperProduct> offsetList = new ArrayList<>();
    int counter = 0;

    public OffsetPaperBox(int price) {
        super(price);
    }

    @Override
    public void addProduct(PrintingPaperProduct printingPaperProduct){
        this.offsetList.add(printingPaperProduct);
    }

    @Override
    public void deleteProduct(PrintingPaperProduct printingPaperProduct){
        this.offsetList.remove(printingPaperProduct);
    }

    @Override
    public void printProducts(PrintingPaperProduct printingPaperProduct){
        System.out.println("Offset Paper Package: " + printingPaperProduct.price);

        for(PrintingPaperProduct product : printingPaperProduct.getList()){
            if(product.getList() != null){
                printProducts(product);
                counter = product.price + counter;
            }
            else{
                System.out.println("Offset Paper Package: " + printingPaperProduct.price);
            }
        }
    }


    @Override
    public List<PrintingPaperProduct> getList(){
        return this.offsetList;
    }

    @Override
    public void totalPrice(){
        System.out.println("Total price: " + (counter + price));
    }
}
