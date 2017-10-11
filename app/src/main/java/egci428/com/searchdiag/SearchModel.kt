package egci428.com.searchdiag
import ir.mirrajabi.searchdialog.core.Searchable
/**
 * Created by 6272user on 10/11/2017 AD.
 */

class SearchModel(private var mTitle:String?):Searchable{
    override fun getTitle(): String {
        return mTitle!!
    }
}