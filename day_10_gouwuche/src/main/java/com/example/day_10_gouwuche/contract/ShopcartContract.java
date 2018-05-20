package com.example.day_10_gouwuche.contract;



import com.example.day_10_gouwuche.base.BaseContract;
import com.example.day_10_gouwuche.bean.GetCartsBean;
import com.example.day_10_gouwuche.bean.SellerBean;

import java.util.List;

public interface ShopcartContract {
    interface View extends BaseContract.BaseView {
        void showCartList(List<SellerBean> groupList, List<List<GetCartsBean.DataBean.ListBean>> childList);

        void updateCartsSuccess(String msg);

        void deleteCartSuccess(String msg);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getCarts(String uid, String token);

        void updateCarts(String uid, String sellerid, String pid, String num, String selected, String token);

        void deleteCart(String uid, String pid, String token);
    }
}
