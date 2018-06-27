$(function() {
	
	$('#query').bind('click', function(){   
		$('#LAY_table_account').datagrid('load',queryParams());
    });  
	
	// 删除
	$('#deleteAccount').bind('click', function(){   
		
		var datas = $('#LAY_table_account').datagrid('getSelections');  
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
				   url: "user/manyusers",
				   data: jsonArray,
				   contentType:"application/json;charset=utf-8",
				   success: function(msg){
					   $.messager.show({
							title:'提示',
							msg:msg.information,
							timeout:5000,
							showType:'slide'
						});  
					   $('#LAY_table_account').datagrid('reload');
				   }
				});
			}
    }); 
	
	$('#LAY_table_account').datagrid({
		url:'user/findusers',
		queryParams:queryParams()
	});
	
	function queryParams(){
		var data = {userAcc:$('#peopleInfo').val(),
				userName:$('#name').val()
		};
		return data;
	}
	
});