$(function() {
	
	$('#query').bind('click', function(){   
		$('#LAY_table_user').datagrid('load',queryParams());
    });  
	
	// 删除
	$('#deleteAdmins').bind('click', function(){   
		
		var datas = $('#LAY_table_user').datagrid('getSelections');  
		var lenth = datas.length;
		if(lenth == 0){
			$.messager.show({
				title:'提示',
				msg:'请选择需要删除的数据！',
				timeout:5000,
				showType:'slide'
			});
		}else{
			var jsonArray = $.toJSON(datas);
			
			$.ajax({
				   type: "DELETE",
				   url: "adminmag/many",
				   data: jsonArray,
				   contentType:"application/json;charset=utf-8",
				   success: function(msg){
					   $.messager.show({
							title:'提示',
							msg:msg.information,
							timeout:5000,
							showType:'slide'
						});  
					   $('#LAY_table_user').datagrid('reload');
				   }
				});
			}
    }); 
	
	$('#LAY_table_user').datagrid({
		url:'adminmag/findadmin',
		queryParams:queryParams()
	});
	
	function queryParams(){
		var data = {adminname:$('#adminname').val(),
				adminacc:$('#adminacc').val(),
				tel:$('#tel').val()
		};
		return data;
	}
	
});