package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb000.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb000Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdlog
     */
    public void insert(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdlog
     */
    public void updateTbtrdlog(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdlog
     */
    public void updateTbtrdlog1(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dcltbtrdord
     * @return 
     */
    public ResultSet openBuySideOrdersTrdpb000(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbtrdord
     */
    public void fetchBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbtrdord
     */
    public void fetchBuySideOrders1Trdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdord
     */
    public void selectTbtrdord(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdsac
     */
    public void selectTbtrdsac(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdsac
     */
    public void selectTbtrdsac1(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdmac
     */
    public void selectTbtrdmac(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdmac
     */
    public void selectTbtrdmac1(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

    /**
     * This method will handle the sql operations for a batch-insert query.
     *
     * @parm sqlca
* @parm settlmentQueueTable
     */
    public void insertTbtrdstq(Sqlca sqlca, SettlmentQueueTable settlmentQueueTable) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdord
     */
    public void updateTbtrdord(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     * @return 
     */
    public ResultSet openSummaryCsrTrdpb000(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void fetchSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdmac
     */
    public void selectTbtrdmac2(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void insert1(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void updateTbtrdsum(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception;

}
