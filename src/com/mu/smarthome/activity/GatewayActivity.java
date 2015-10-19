package com.mu.smarthome.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.mu.smarthome.R;
import com.mu.smarthome.model.GatewayEntity;
import com.mu.smarthome.utils.LogManager;
import com.mu.smarthome.utils.ShareDataTool;

/**
 * @author Mu
 * @date 2015-10-17下午2:45:12
 * @description
 */
public class GatewayActivity extends BaseActivity implements OnClickListener {

	private EditText ip;

	private TextView id;

	private TextView type;

	private TextView getId;

	private TextView save;

	private TextView cancel;

	private GatewayEntity entity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gateway);
		initView();

	}

	private void initView() {
		ip = (EditText) findViewById(R.id.gateway_ip);
		id = (TextView) findViewById(R.id.gateway_id);
		type = (TextView) findViewById(R.id.gateway_type);
		getId = (TextView) findViewById(R.id.gateway_getid);
		save = (TextView) findViewById(R.id.gateway_save);
		cancel = (TextView) findViewById(R.id.gateway_cancel);

		getId.setOnClickListener(this);
		save.setOnClickListener(this);
		cancel.setOnClickListener(this);
		entity = ShareDataTool.getGateWay(this);
		if (entity == null) {
			entity = new GatewayEntity("", "", "");
		}
		ip.setText(entity.ipAddress);
		id.setText(entity.identier);
		type.setText("HYV1.1");
		com.mu.smarthome.utils.LogManager.LogShow("-----", "00000000000000", LogManager.ERROR);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		com.mu.smarthome.utils.LogManager.LogShow("-----", "00000000000000ddd", LogManager.ERROR);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.gateway_getid:

			break;
		case R.id.gateway_save:

			break;
		case R.id.gateway_cancel:

			break;

		default:
			break;
		}
	}
}
