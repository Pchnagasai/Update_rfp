<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, com.model.*" %>
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

<% List<TrackerEnquiry> enqid = (List<TrackerEnquiry>) request.getAttribute("enquiry"); %>
<% List<RejectEnquiry> rejectdata = (List<RejectEnquiry>) request.getAttribute("reject"); %>
<% List<TrackerEnquiry> convertrfp = (List<TrackerEnquiry>) request.getAttribute("converttorfo"); %>

<h1>Enquiry Tracker</h1>
<table>
    <tr>
        <th>Enqr_ID</th>
        <th>Status</th>
        <th>Enq_approve</th>
        <th>Converted_To_Rfp</th>
        <th>RFP Reject</th>
        <th>RFP Approve</th>
        <th>RFP Completed</th>
    </tr>
    <% for (int i = 0; i < enqid.size(); i++) { %>
        <tr>
            <td><%= enqid.get(i).getEnqrid() %></td>
            <% boolean isRejected = false;
            for (int j = 0; j < rejectdata.size(); j++) {
                RejectEnquiry reject = rejectdata.get(j);
                if (reject.getEnqr_id() == enqid.get(i).getEnqrid()) {
                    isRejected = true;
                    break;
                }
            }
            if (isRejected) { %>
                <td>Rejected</td>
                <td></td>
            <% } else { %>
                <td></td>
                <td>Approve</td>
            <% } %>
            
            <% boolean isConvertedToRfp = false;
            for (int k = 0; k < convertrfp.size(); k++) {
                TrackerEnquiry rfp = convertrfp.get(k);
                if (rfp.getEnqrid() == enqid.get(i).getEnqrid()) {
                    isConvertedToRfp = true;
                    break;
                }
            }
            if (isConvertedToRfp) { %>
                <td>rfps</td>
            <% } else { %>
                <td></td>
            <% } %>
            
            <td></td>
            <td></td>
            <td></td>
        </tr>
    <% } %>
</table>
</body>
</html>
