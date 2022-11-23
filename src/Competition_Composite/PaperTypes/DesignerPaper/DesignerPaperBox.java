package Competition_Composite.PaperTypes.DesignerPaper;

import Competition_Composite.PrintingPaperProduct;

import java.util.ArrayList;
import java.util.List;

public class DesignerPaperBox extends PrintingPaperProduct {
    List<PrintingPaperProduct> designerList = new ArrayList<>();
    int counter = 0;

    public DesignerPaperBox(int price) {
        super(price);
    }

    @Override
    public void addProduct(PrintingPaperProduct printingPaperProduct){
        this.designerList.add(printingPaperProduct);
    }

    @Override
    public void deleteProduct(PrintingPaperProduct printingPaperProduct){
        this.designerList.remove(printingPaperProduct);
    }

    @Override
    public void printProducts(PrintingPaperProduct printingPaperProduct){
        System.out.println("Designer Paper Package: " + printingPaperProduct.price);

        for(PrintingPaperProduct product : printingPaperProduct.getList()){
            if(product.getList() != null){
                printProducts(product);
                counter = product.price + counter;
            }
            else{
                System.out.println("Designer Paper Package: " + printingPaperProduct.price);
            }
        }
    }


    @Override
    public List<PrintingPaperProduct> getList(){
        return this.designerList;
    }

    @Override
    public void totalPrice(){
        System.out.println("Total price: " + (counter + price));
    }
}
