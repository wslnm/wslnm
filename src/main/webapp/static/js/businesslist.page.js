$(function() {
	
	$('#query').bind('click', function(){   
		$('#LAY_table_business').datagrid('load',queryParams());
    });  
	
	// 删除
	$('#deleteBusiness').bind('click', function(){   
		
		var datas = $('#LAY_table_business').datagrid('getSelections');  
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
				   url: "businessmag/many",
				   data: jsonArray,
				   contentType:"application/json;charset=utf-8",
				   success: function(msg){
					   $.messager.show({
							title:'提示',
							msg:msg.information,
							timeout:5000,
							showType:'slide'
						});  
					   $('#LAY_table_business').datagrid('reload');
				   }
				});
			}
    }); 
	
	$('#LAY_table_business').datagrid({
		url:'businessmag/findbusiness',
		queryParams:queryParams()
	});
	
	function queryParams(){
		var data = {businessAcc:$('#peopleInfo').val(),
				businessIp:$('#name').val()
		};
		return data;
	}
	
});