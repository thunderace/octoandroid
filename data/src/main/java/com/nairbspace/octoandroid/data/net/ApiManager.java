package com.nairbspace.octoandroid.data.net;

import com.nairbspace.octoandroid.data.db.PrinterDbEntity;
import com.nairbspace.octoandroid.data.entity.ArbitraryCommandEntity;
import com.nairbspace.octoandroid.data.entity.ConnectEntity;
import com.nairbspace.octoandroid.data.entity.ConnectionEntity;
import com.nairbspace.octoandroid.data.entity.FileCommandEntity;
import com.nairbspace.octoandroid.data.entity.SlicingCommandEntity;
import com.nairbspace.octoandroid.data.entity.VersionEntity;
import com.nairbspace.octoandroid.domain.model.TempCommand;

import okhttp3.MultipartBody;
import rx.Observable;
import rx.functions.Func1;

public interface ApiManager extends OctoApi {

    Func1<PrinterDbEntity, Observable<VersionEntity>> funcGetVersion();

    Func1<ConnectionEntity, Observable<ConnectionEntity>> funcGetConnection();

    Func1<ConnectEntity, Observable<?>> connectToPrinter();

    Func1<FileCommandEntity, Observable<?>> funcStartFilePrint(String apiUrl);

    Func1<MultipartBody.Part, Observable<?>> funcUploadFile();

    Func1<Object, Observable<?>> funcSendToolOrBedCommand(TempCommand tempCommand);

    Func1<Object, Observable<?>> funcSendPrintHeadCommand();

    Func1<Object, Observable<?>> funcSendToolCommand();

    Func1<SlicingCommandEntity, Observable<?>> funcSendSliceCommand(String apiUrl);

    Func1<ArbitraryCommandEntity, Observable<?>> funcSendArbitraryCommand();

    Func1<Object, Observable<?>> funcSelectTool();
}
