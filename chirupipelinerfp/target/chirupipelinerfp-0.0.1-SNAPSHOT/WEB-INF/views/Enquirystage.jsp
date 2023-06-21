

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List,com.model.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Enquiry Tracker</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<%List<TrackerEnquiry> enqid =(List<TrackerEnquiry>)request.getAttribute("enquiry"); %>
<% List<RejectEnquiry> rejectdata = (List<RejectEnquiry>)request.getAttribute("reject");%>
    <h1>Enquiry Tracker</h1>
    <table>
        <tr>
            <th>Enqr_ID</th>
            
            <th>Enquiry_Rejected</th>
            
            <th> Enq_approve</th>
            <th>Converted_To_Rfp</th>
            
            <th>RFP Reject</th>
            
            <th>RFP Approve</th>
            <th>RFP Completed</th> 
        </tr>
        <%for(int i=0;i<enqid.size();i++){ %>
        <tr>
        <td><%=enqid.get(i).getEnqrid() %></td>
        <%for(int j=0;j<rejectdata.size();j++){ 
        	RejectEnquiry reject = rejectdata.get(j);
        	if(reject.getEnqr_id() == enqid.get(i).getEnqrid()) {
        %>
        <td>Rejected</td>
         <%} } }%>
         
        
         
        </tr>
       
    </table>
</body>
</html>






