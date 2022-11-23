package Competition_Composite.PaperTypes.NewsprintPaper;

import Competition_Composite.PrintingPaperProduct;

import java.util.ArrayList;
import java.util.List;

public class NewsprintPaperBox extends PrintingPaperProduct {
    List<PrintingPaperProduct> newsprintList = new ArrayList<>();
    int counter = 0;

    public NewsprintPaperBox(int price) {
        super(price);
    }

    @Override
    public void addProduct(PrintingPaperProduct printingPaperProduct){
        this.newsprintList.add(printingPaperProduct);
    }

    @Override
    public void deleteProduct(PrintingPaperProduct printingPaperProduct){
        this.newsprintList.remove(printingPaperProduct);
    }

    @Override
    public void printProducts(PrintingPaperProduct printingPaperProduct){
        System.out.println("Newsprint Paper Package: " + printingPaperProduct.price);

        for(PrintingPaperProduct product : printingPaperProduct.getList()){
            if(product.getList() != null){
                printProducts(product);
                counter = product.price + counter;
            }
            else{
                System.out.println("Newsprint Paper Package: " + printingPaperProduct.price);
            }
        }
    }


    @Override
    public List<PrintingPaperProduct> getList(){
        return this.newsprintList;
    }

    @Override
    public void totalPrice(){
        System.out.println("Total price: " + (counter + price));
    }
}
